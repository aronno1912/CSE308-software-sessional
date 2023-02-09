package off1;

import java.util.List;

public interface Builder {
   void addGraphicsCard(List<String>l);
   void addRAM(List<String>l);
   Computer getPc();
}