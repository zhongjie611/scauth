package com.gd.science.auth.pojo;

import java.util.Date;

public class TbFunction {
    private Long id;

    private String functionCode;

    private String functionName;

    private String description;

    private String functionUrl;

    private String generateMenu;

    private Integer iIndex;

    private String createBy;

    private Date creationTime;

    private Long parentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode == null ? null : functionCode.trim();
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFunctionUrl() {
        return functionUrl;
    }

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl == null ? null : functionUrl.trim();
    }

    public String getGenerateMenu() {
        return generateMenu;
    }

    public void setGenerateMenu(String generateMenu) {
        this.generateMenu = generateMenu == null ? null : generateMenu.trim();
    }

    public Integer getiIndex() {
        return iIndex;
    }

    public void setiIndex(Integer iIndex) {
        this.iIndex = iIndex;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}