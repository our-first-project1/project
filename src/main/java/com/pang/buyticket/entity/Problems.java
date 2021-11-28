package com.pang.buyticket.entity;

/**
 * @Description 常见问题
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/27 20:43
 */
public class Problems {
    //问题编号
    private int problemId;
    //问题分类
    private String problemCategory;
    //问题标题
    private String problemTitle;
    //问题答案
    private String problem;


    public Problems() {
    }

    public Problems(int problemId, String problemCategory, String problemTitle, String problem) {
        this.problemId = problemId;
        this.problemCategory = problemCategory;
        this.problemTitle = problemTitle;
        this.problem = problem;
    }

    /**
     * 获取
     * @return problemId
     */
    public int getProblemId() {
        return problemId;
    }

    /**
     * 设置
     * @param problemId
     */
    public void setProblemId(int problemId) {
        this.problemId = problemId;
    }

    /**
     * 获取
     * @return problemCategory
     */
    public String getProblemCategory() {
        return problemCategory;
    }

    /**
     * 设置
     * @param problemCategory
     */
    public void setProblemCategory(String problemCategory) {
        this.problemCategory = problemCategory;
    }

    /**
     * 获取
     * @return problemTitle
     */
    public String getProblemTitle() {
        return problemTitle;
    }

    /**
     * 设置
     * @param problemTitle
     */
    public void setProblemTitle(String problemTitle) {
        this.problemTitle = problemTitle;
    }

    /**
     * 获取
     * @return problem
     */
    public String getProblem() {
        return problem;
    }

    /**
     * 设置
     * @param problem
     */
    public void setProblem(String problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        return "Problems{problemId = " + problemId + ", problemCategory = " + problemCategory + ", problemTitle = " + problemTitle + ", problem = " + problem + "}";
    }
}
