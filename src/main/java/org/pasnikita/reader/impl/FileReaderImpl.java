package org.pasnikita.reader.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.reader.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderImpl implements FileReader {
  public static final Logger LOGGER = LogManager.getLogger();

  @Override
    public List<String> read(String path) throws ArrayException {
    List<String> lines;
      try{
        lines = Files.readAllLines(Paths.get(path));
      }
      catch (IOException e){
        LOGGER.error(e.getMessage());
        throw new ArrayException("Cannot read file: " + path);
      }
      return lines;
  }

}
