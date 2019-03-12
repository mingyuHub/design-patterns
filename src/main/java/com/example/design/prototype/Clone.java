package com.example.design.prototype;

import lombok.Data;

import java.io.*;

/**
 * @author: chenmingyu
 * @date: 2019/2/28 14:53
 * @description: 浅克隆
 */
@Data
public class Clone implements Cloneable ,Serializable {

    private CloneA CloneA;

    public Clone() {
        this.CloneA = new CloneA();
    }

    @Override
    protected Clone clone() throws CloneNotSupportedException {
        return (Clone) super.clone();
    }

    /**
     * 深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    protected Clone deepClone() throws CloneNotSupportedException {
        Clone clone = null;
        try{
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(baos);
            oos.writeObject(this);
            oos.close();
            ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(bais);
            //生成新的对象实例
            clone=(Clone)ois.readObject();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }

    class CloneA implements Serializable{
    }
}
