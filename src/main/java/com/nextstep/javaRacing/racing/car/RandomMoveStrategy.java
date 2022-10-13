package com.nextstep.javaRacing.racing.car;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy {

    private static final int MAX_RANDOM = 10;
    private static final int THRESHOLD = 4;

    private final Random random = new Random(System.currentTimeMillis());

    @Override
    public boolean isMovable() {
        return random.nextInt(MAX_RANDOM) >= THRESHOLD;
    }
}