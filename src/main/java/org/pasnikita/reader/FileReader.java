package org.pasnikita.reader;

import org.pasnikita.exception.ArrayException;

import java.util.List;

public interface FileReader {

  List<String> read(String path) throws ArrayException;

}
