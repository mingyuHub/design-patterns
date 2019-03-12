package com.example.design.prototype;

import java.util.stream.IntStream;

/**
 * @author: chenmingyu
 * @date: 2019/2/28 09:55
 * @description:
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException{
        PenFactory.init();
        IntStream.range(0,2).forEach(i->{
            try {
                System.out.println(PenFactory.getPen(CarbonPen.class).getClass());
                System.out.println(PenFactory.getPen(Pencil.class).getClass());
                System.out.println("  ... ");
            }catch (CloneNotSupportedException e){
                e.printStackTrace();
            }
        });

        Clone clone = new Clone();
        Clone clone1 = clone.deepClone();
        System.out.println(clone == clone1);
        System.out.println(clone.getCloneA() == clone1.getCloneA());
    }
}
