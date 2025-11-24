package org.pasnikita.reader;

import org.pasnikita.exception.ArrayException;

import java.util.List;

public interface DataReader {

  List<String> read(String path) throws ArrayException;

}
