package cn.jinzhu.cli.prescription.entity.hos;

import cn.jinzhu.cli.masterdata.entity.hos.User;
import cn.jinzhu.cli.prescription.entity.med.MenEast;
import cn.jinzhu.cli.prescription.entity.med.MenWestern;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(value = "pre_template对象",description = "处方模板信息")
public class PreTemplate {

    @ApiModelProperty(value = "处方模板主键id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "模板编号",name = "number")
    private String number;
    @ApiModelProperty(value = "模板名称",name = "tempName")
    private String tempName;
    @ApiModelProperty(value = "诊断",name = "diagnosis")
    private String diagnosis;
    @ApiModelProperty(value = "模板权限",name = "premiss")
    private String premiss;
    @ApiModelProperty(value = "创建时间",name = "createDate")
    private Date createDate;
    @ApiModelProperty(value = "创建人",name = "createId")
    private User user;
    @ApiModelProperty(value = "说明",name = "    suoming")
    private  String suoming;

    public String getSuoming() {
        return suoming;
    }

    public void setSuoming(String suoming) {
        this.suoming = suoming;
    }

    public List<MenWestern> getMenWesterns() {
        return menWesterns;
    }

    public void setMenWesterns(List<MenWestern> menWesterns) {
        this.menWesterns = menWesterns;
    }

    public List<MenEast> getMenEasts() {
        return menEasts;
    }

    public void setMenEasts(List<MenEast> menEasts) {
        this.menEasts = menEasts;
    }

    @ApiModelProperty(value = "处方类型",name = "prescriType")
    private PrescriType prescriType;
    @ApiModelProperty(value = "西药处方集合",name = "menWesterns")
    private List<MenWestern> menWesterns;
    @ApiModelProperty(value = "中药处方集合",name = "menEasts")
    private List<MenEast> menEasts;

    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPremiss() {
        return premiss;
    }

    public void setPremiss(String premiss) {
        this.premiss = premiss;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PrescriType getPrescriType() {
        return prescriType;
    }

    public void setPrescriType(PrescriType prescriType) {
        this.prescriType = prescriType;
    }
}
