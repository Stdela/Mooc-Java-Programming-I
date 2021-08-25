
package com.mycompany.part5_04songs;


public class Songs {
private String name;
private String singer;
private int length;

    public Songs() {
    }

    public Songs(String name, String singer, int length) {
        this.name = name;
        this.singer = singer;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Songs{" + "name=" + name + ", singer=" + singer + ", length=" + length + '}';
    }
public boolean songsCompared(Songs comp){
    if (this == comp) {
        return true;
    }
    if (!(comp instanceof Songs)) {
        return false;
    }
    Songs cancion = (Songs) comp;
      if (this.name.equals(cancion.name)&& this.singer.equals(cancion.singer)&& this.length == cancion.length) {
        return true;
    } else{
          return false;
  
}
}
}

