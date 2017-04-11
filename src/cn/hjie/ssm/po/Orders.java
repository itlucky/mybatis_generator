package cn.hjie.ssm.po;

import java.util.Date;

public class Orders {
    private Long id;

    private Long userPId;

    private String no;

    private Date createtime;

    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserPId() {
        return userPId;
    }

    public void setUserPId(Long userPId) {
        this.userPId = userPId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}