package com.bignerdranch.geoquiz;

public class Questions {

    private int mTextResId;
    private boolean mAnswerTrue;

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public Questions(int textResId, boolean answerTru) {
        mTextResId = textResId;
        mAnswerTrue = answerTru;
    }
}
