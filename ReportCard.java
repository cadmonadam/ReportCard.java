package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This ReportCard based on the Hungarian Educational System.
 * The grades are represented by five numeric values, from 1 to 5, where 1 is the worst and 5 is the best grade.
 * There are 12 college years, where 1-8 are the basic, while 9-12 are the secondary school's years.
 * There are six main subject that are obligatory to learn: Hungarian Literature, Maths, History, Hungarian Grammar, Foreign Language, Biology.
 */

public class ReportCard extends AppCompatActivity {

    // This constant stores the name of the educational institution.
    private static final String INSTITUTION_NAME = "XY Technical Secondary School";

    //This variable stores the name of the students.
    private String mStudentName;

    //This variable stores the college year what the student is in.
    private int mCollegeYear;

    //This variable represents the student's grade in Hungarian Literature.
    private int mHungarianLiteratureGrade;

    //This variable represents the student's grade in Mathematics.
    private int mMathematicsGrade;

    //This variable represents the student's grade in History.
    private int mHistoryGrade;

    //This variable stores the student's grade in Hungarian Grammar.
    private int mHungarianGrammarGrade;

    //This variable stores the student's grade in a Foreign Language.
    private int mForeignLanguageGrade;

    //This variable stores the student's grade in Biology.
    private int mBiologyGrade;


    /**
     * Creating a new ReportCard object with the following paramaters:
     *
     * @param studentName              is stands for the name of the student.
     * @param collegeYear              is stands for the actual college year what the student is in.
     * @param hungarianLiteratureGrade is the student's grade in Hungarian Literature.
     * @param mathematicsGrade         is the student's grade in Mathematics.
     * @param historyGrade             is the student's grade in History.
     * @param hungarianGrammarGrade    is the student's grade in Hungarian Grammar.
     * @param foreignLanguageGrade     is the student's grade in Foreign Language.
     * @param biologyGrade             is the student's grade in Biology.
     */

    public ReportCard(String studentName, int collegeYear, int hungarianLiteratureGrade, int mathematicsGrade, int historyGrade, int hungarianGrammarGrade, int foreignLanguageGrade, int biologyGrade) {
        mStudentName = studentName;
        mCollegeYear = collegeYear;
        mHungarianLiteratureGrade = hungarianLiteratureGrade;
        mMathematicsGrade = mathematicsGrade;
        mHistoryGrade = historyGrade;
        mHungarianGrammarGrade = hungarianGrammarGrade;
        mForeignLanguageGrade = foreignLanguageGrade;
        mBiologyGrade = biologyGrade;


    }

    public String getmStudentName() {
        return mStudentName;
    }

    public void setmStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    public int getmCollegeYear() {
        return mCollegeYear;
    }

    public void setmCollegeYear(int mCollegeYear) {
        this.mCollegeYear = mCollegeYear;
    }

    public int getmHungarianLiteratureGrade() {
        return mHungarianLiteratureGrade;
    }

    public void setmHungarianLiteratureGrade(int mHungarianLiteratureGrade) {
        this.mHungarianLiteratureGrade = mHungarianLiteratureGrade;
    }

    public int getmMathematicsGrade() {
        return mMathematicsGrade;
    }

    public void setmMathematicsGrade(int mMathematicsGrade) {
        this.mMathematicsGrade = mMathematicsGrade;
    }

    public int getmHistoryGrade() {
        return mHistoryGrade;
    }

    public void setmHistoryGrade(int mHistoryGrade) {
        this.mHistoryGrade = mHistoryGrade;
    }

    public int getmHungarianGrammarGrade() {
        return mHungarianGrammarGrade;
    }

    public void setmHungarianGrammarGrade(int mHungarianGrammarGrade) {
        this.mHungarianGrammarGrade = mHungarianGrammarGrade;
    }

    public int getmForeignLanguageGrade() {
        return mForeignLanguageGrade;
    }

    public void setmForeignLanguageGrade(int mForeignLanguageGrade) {
        this.mForeignLanguageGrade = mForeignLanguageGrade;
    }

    public int getmBiologyGrade() {
        return mBiologyGrade;
    }

    public void setmBiologyGrade(int mBiologyGrade) {
        this.mBiologyGrade = mBiologyGrade;
    }


    @Override
    public String toString() {
        return "ReportCard{" +
                "\nInstitution Name:" + INSTITUTION_NAME +
                "\nStudent Name:" + mStudentName +
                "\nCollege Year:" + mCollegeYear +
                "\nGrade in Hungarian Literature:" + mHungarianLiteratureGrade +
                "\nGrade in Mathematics:" + mMathematicsGrade +
                "\nGrade in History:" + mHistoryGrade +
                "\nGrade in Hungarian Grammar:" + mHungarianGrammarGrade +
                "\nGrade in Foreign Language:" + mForeignLanguageGrade +
                "\nGrade in Biology:" + mBiologyGrade +
                '}';
    }
}
