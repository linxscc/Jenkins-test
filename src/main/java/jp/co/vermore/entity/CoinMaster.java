package jp.co.vermore.entity;

import jp.co.vermore.common.mvc.BaseEntity;

import java.util.Date;

public class CoinMaster extends BaseEntity {

    private long id;

    private long coinId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coin_master.coin_type
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    private Byte coinType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coin_master.desc
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coin_master.create_datetime
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    private Date createDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coin_master.update_datetime
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    private Date updateDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coin_master.del_flg
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    private Boolean delFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coin_master.note
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coin_master.coin_type
     *
     * @return the value of coin_master.coin_type
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public Byte getCoinType() {
        return coinType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coin_master.coin_type
     *
     * @param coinType the value for coin_master.coin_type
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public void setCoinType(Byte coinType) {
        this.coinType = coinType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coin_master.desc
     *
     * @return the value of coin_master.desc
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coin_master.desc
     *
     * @param desc the value for coin_master.desc
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coin_master.create_datetime
     *
     * @return the value of coin_master.create_datetime
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coin_master.create_datetime
     *
     * @param createDatetime the value for coin_master.create_datetime
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coin_master.update_datetime
     *
     * @return the value of coin_master.update_datetime
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coin_master.update_datetime
     *
     * @param updateDatetime the value for coin_master.update_datetime
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coin_master.del_flg
     *
     * @return the value of coin_master.del_flg
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public Boolean getDelFlg() {
        return delFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coin_master.del_flg
     *
     * @param delFlg the value for coin_master.del_flg
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coin_master.note
     *
     * @return the value of coin_master.note
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coin_master.note
     *
     * @param note the value for coin_master.note
     *
     * @mbggenerated Tue Apr 03 14:34:53 CST 2018
     */
    public void setNote(String note) {
        this.note = note;
    }



    public long getCoinId() {
        return coinId;
    }

    public void setCoinId(long coinId) {
        this.coinId = coinId;
    }
}