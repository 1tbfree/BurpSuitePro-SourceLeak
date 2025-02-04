package org.bouncycastle.tsp.ers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ERSDirectoryDataGroup extends ERSDataGroup {
  public ERSDirectoryDataGroup(File paramFile) throws FileNotFoundException {
    super(buildGroup(paramFile));
  }
  
  private static List<ERSData> buildGroup(File paramFile) throws FileNotFoundException {
    if (paramFile.isDirectory()) {
      File[] arrayOfFile = paramFile.listFiles();
      ArrayList<ERSDirectoryDataGroup> arrayList = new ArrayList(arrayOfFile.length);
      for (byte b = 0; b != arrayOfFile.length; b++) {
        if (arrayOfFile[b].isDirectory()) {
          if ((arrayOfFile[b].listFiles()).length != 0)
            arrayList.add(new ERSDirectoryDataGroup(arrayOfFile[b])); 
        } else {
          arrayList.add(new ERSFileData(arrayOfFile[b]));
        } 
      } 
      return (List)arrayList;
    } 
    throw new IllegalArgumentException("file reference does not refer to directory");
  }
  
  public List<ERSFileData> getFiles() {
    ArrayList<ERSFileData> arrayList = new ArrayList();
    for (byte b = 0; b != this.dataObjects.size(); b++) {
      if (this.dataObjects.get(b) instanceof ERSFileData)
        arrayList.add((ERSFileData)this.dataObjects.get(b)); 
    } 
    return arrayList;
  }
  
  public List<ERSDirectoryDataGroup> getSubdirectories() {
    ArrayList<ERSDirectoryDataGroup> arrayList = new ArrayList();
    for (byte b = 0; b != this.dataObjects.size(); b++) {
      if (this.dataObjects.get(b) instanceof ERSDirectoryDataGroup)
        arrayList.add((ERSDirectoryDataGroup)this.dataObjects.get(b)); 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSDirectoryDataGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */