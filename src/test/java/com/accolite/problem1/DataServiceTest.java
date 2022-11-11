package com.accolite.problem1;

import com.accolite.problem1.exception.FileIsCorruptException;
import com.accolite.problem1.exception.FileTypeNotSupportedException;
import com.accolite.problem1.reader.FileType;
import org.junit.Test;

public class DataServiceTest {

    @Test
    public void testFilesCountsWithTheType() {
        DataService dataRecorder = new DataService();
        assert dataRecorder.getAllFileNames(FileType.CSV).size() == 2;
        assert dataRecorder.getAllFileNames(FileType.XML).size() == 2;
        assert dataRecorder.getAllFileNames(FileType.EXCEL).size() == 1;
    }

    @Test
    public void testNumberOfRecordsWithFileName() {
        DataService dataService = new DataService();
        assert dataService.getRecordsWithFileName("Data.csv", FileType.CSV).size() == 10;
        assert dataService.getRecordsWithFileName("Data.xml", FileType.XML).size() == 3;
        assert dataService.getRecordsWithFileName("Data.xls", FileType.EXCEL).size() == 5;
    }


    @Test(expected = FileTypeNotSupportedException.class)
    public void testExceptionWhenSendingFileTypeAsDefault() {
        DataService dataService = new DataService();
        dataService.getAllFileNames(FileType.DEFAULT);
    }

    @Test(expected = FileIsCorruptException.class)
    public void testExceptionWhenParsingCorruptFile() {
        DataService dataService = new DataService();
        dataService.getRecordsWithFileName("CorruptFile.xml", FileType.XML);
    }
}
