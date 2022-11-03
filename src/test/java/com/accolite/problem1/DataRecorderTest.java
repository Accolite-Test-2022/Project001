package com.accolite.problem1;

import org.junit.Test;
public class DataRecorderTest {
    @Test
    public void testNumberOfRecords(){
        DataRecorder dataRecorder = new DataRecorder();
        assert dataRecorder.getRecords(FileType.CSV).size() == 10;
        assert dataRecorder.getRecords(FileType.XML).size() == 3;
        assert dataRecorder.getRecords(FileType.EXCEL).size() == 5;
    }
}
