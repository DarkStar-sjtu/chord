package cn.dk.chord.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("audio")
public class Audio {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String path;
}
