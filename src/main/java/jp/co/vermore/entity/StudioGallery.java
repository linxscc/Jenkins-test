package jp.co.vermore.entity;

import jp.co.vermore.common.mvc.BaseEntity;

import java.util.Date;

public class StudioGallery extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_gallery.id
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_gallery.url
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_gallery.type
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_gallery.score
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_gallery.create_datetime
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    private Date createDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_gallery.update_datetime
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    private Date updateDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_gallery.del_flg
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    private Boolean delFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studio_gallery.note
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_gallery.id
     *
     * @return the value of studio_gallery.id
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_gallery.url
     *
     * @return the value of studio_gallery.url
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_gallery.url
     *
     * @param url the value for studio_gallery.url
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_gallery.type
     *
     * @return the value of studio_gallery.type
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_gallery.type
     *
     * @param type the value for studio_gallery.type
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_gallery.score
     *
     * @return the value of studio_gallery.score
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_gallery.score
     *
     * @param score the value for studio_gallery.score
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_gallery.create_datetime
     *
     * @return the value of studio_gallery.create_datetime
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_gallery.create_datetime
     *
     * @param createDatetime the value for studio_gallery.create_datetime
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_gallery.update_datetime
     *
     * @return the value of studio_gallery.update_datetime
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_gallery.update_datetime
     *
     * @param updateDatetime the value for studio_gallery.update_datetime
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_gallery.del_flg
     *
     * @return the value of studio_gallery.del_flg
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public Boolean getDelFlg() {
        return delFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_gallery.del_flg
     *
     * @param delFlg the value for studio_gallery.del_flg
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studio_gallery.note
     *
     * @return the value of studio_gallery.note
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studio_gallery.note
     *
     * @param note the value for studio_gallery.note
     *
     * @mbggenerated Thu May 24 20:34:31 CST 2018
     */
    public void setNote(String note) {
        this.note = note;
    }
}