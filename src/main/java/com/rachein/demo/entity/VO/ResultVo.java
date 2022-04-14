package com.rachein.demo.entity.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.rachein.demo.exception.CodeMsg;
import lombok.Data;

import java.util.List;
import java.util.Objects;

/**
 * @author 计算机系 ITAEM 吴远健
 * @date 2022/2/27 20:32
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)//避免返回NULL字段
public class ResultVo<T> {

    private Integer code;
    private String msg = "";
    private T data;
    private List<CodeMsg> errors;

    public ResultVo() {}

    private ResultVo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private ResultVo(CodeMsg codeMsg) {
        if (!Objects.isNull(codeMsg)) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
        }
    }

    private ResultVo(List<CodeMsg> codeMsgs, T data) {
        if (!Objects.isNull(codeMsgs) && codeMsgs.size() != 0) {
            this.code = 50544;
            this.msg = "发生异常!";
            this.errors = codeMsgs;
            this.data = data;
        }
    }


    public static <T> ResultVo<T> success(T data) {return new ResultVo<T>(CodeMsg.SUCCESS.getCode(), CodeMsg.SUCCESS.getMsg(), data);}

    public static <T> ResultVo<T> error(CodeMsg codeMsg) {return new ResultVo<>(codeMsg);}

    public static <T> ResultVo<T> error(List<CodeMsg> codeMsgs, T data) {
        return new ResultVo<T>(codeMsgs, data);
    }

}
