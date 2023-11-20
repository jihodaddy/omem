package com.springboot.omem.comment.entity;

import com.springboot.omem.comment.dto.CommentRequestDto;
import com.springboot.omem.common.entity.BaseEntity;
import com.springboot.omem.member.entity.Member;
import com.springboot.omem.note.entity.Note;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "member_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @JoinColumn(name = "note_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Note note;

    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Comment parent;

    @Builder.Default
    @OneToMany(mappedBy = "parent", orphanRemoval = true)
    private List<Comment> children = new ArrayList<>();

    public void update(CommentRequestDto commentRequestDto) {
        this.content = commentRequestDto.getContent();
    }

    public void updateParent(Comment comment) {
        this.parent = parent;
    }

    public boolean isValidateMember(Member member) {
        return !this.member.equals(member);
    }
}
