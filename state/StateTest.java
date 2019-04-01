package com.example.design.state;

import com.example.design.abstract_factory.domain.Gameable;

/**
 * @author: chenmingyu
 * @date: 2019/3/26 19:48
 * @description:
 */
public class StateTest {

    public static void main(String[] args) {
        Context context = new Context();

        Stateable studyState = new StudyState();
        context.setStateable(studyState);
        context.getStateable().doSometing();

        Stateable gameState = new GameState();
        context.setStateable(gameState);
        context.getStateable().doSometing();
    }
}
