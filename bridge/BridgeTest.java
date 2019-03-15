package com.example.design.bridge;

/**
 * @author: chenmingyu
 * @date: 2019/3/11 17:47
 * @description:
 */
public class BridgeTest {

    public static void main(String[] args) {
        AbstractGame nintendoGame = new NintendoGame();
        nintendoGame.setAbstractDisplayer(new LCDDisplay());
        nintendoGame.play();
        AbstractGame tencentGame = new TencentGame();
        tencentGame.setAbstractDisplayer(new CRTDisplayer());
        tencentGame.play();
    }
}
