package com.yuyue.pagehelper.result;

import java.io.Serializable;

/**
 * @Auther: 于不凡
 */
public class ResultMessage implements Serializable {

    /**
     * 消息提示标题
     */
    private String title;

    /**
     * 消息提示内容
     */
    private String msg;

    /**
     * 消息提示的图标名称
     */
    private String ico;

    /**
     * 页面需要的结果数据
     */
    private Object data;

    /**
     * 返回的状态编码。（200代表执行成功，其他代表执行失败。）
     */
    private int status;

    public static ResultMessage ok() {
        return new ResultMessage("系统消息", "操作成功", "info", null, 200);
    }

    public static ResultMessage ok(Object data) {
        return new ResultMessage("系统消息", "操作成功", "info", data, 200);
    }

    public static ResultMessage ok(String msg) {
        return new ResultMessage("系统消息", msg, "info", null, 200);
    }

    public static ResultMessage ok(String mse,Object data) {
        return new ResultMessage("系统消息", mse, "info", data, 200);
    }

    public static ResultMessage error() {
        return new ResultMessage("系统消息", "操作失败", "error", null, 500);
    }

    public static ResultMessage error(String msg) {
        return new ResultMessage("系统消息", msg, "error", null, 500);
    }

    public ResultMessage(String title, String msg, String ico, Object data, int status) {
        super();
        this.title = title;
        this.msg = msg;
        this.ico = ico;
        this.data = data;
        this.status = status;
    }

    private static final long serialVersionUID = 1L;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
