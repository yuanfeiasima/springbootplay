package com.wwt.springbootplay.algorithms;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 按序打印
 * @author grace
 * @date 2019-07-18 12:01
 */
public class L1114SortPrint {

    ReentrantLock lock = new ReentrantLock();
    Condition firstCondition = lock.newCondition();
    Condition secondCondition = lock.newCondition();
    Condition thirdCondition = lock.newCondition();

    int state = 1;

    public void first(Runnable printFirst) throws InterruptedException{
        lock.lock();
        try {
            if (state != 1) {
                firstCondition.await();
            }

            state = 2;
            printFirst.run();
            secondCondition.signal();
        }finally {
            lock.unlock();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException{
        lock.lock();
        try {
            if (state != 2) {
                secondCondition.await();
            }
            state = 3;
            printSecond.run();
            thirdCondition.signal();
        }finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException{
        lock.lock();
        try {
            if (state != 3) {
                thirdCondition.await();
            }

            state = 3;
            printThird.run();
        }finally {
            lock.unlock();
        }
    }
}
