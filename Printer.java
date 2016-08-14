abstract class Printer {
  private Integer portNumber = getPortNumber();
  abstract Integer getPortNumber();
  public static void main(String[]s) {
    Printer p = new LPDPrinter();
    System.out.println(p.portNumber);
  }
}

class LPDPrinter extends Printer {
  /* Line Printer Deamon port no is 515 */
  private Integer defaultPortNumber = 515;
  Integer getPortNumber() {
    return defaultPortNumber;
  }
}

