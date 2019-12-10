public class RegexPhoneNumber {
  public static void main(String[] args) {
    System.out.print(String.valueOf(isValidateNumber("+62 8999564873")));
  }
  
  private static boolean isValidateNumber(String phone) {
    // return phone.matches("^(?:(?:\\+|0{0,2}))"); // +
    // return phone.matches("^(?:(?:\\+|0{0,2})62)"); // +62
    // return phone.matches("(\\s*[\\-]\\s*)"); // - result
    // return phone.matches("^[0-9]{11,13}$"); // more than 10-13
    
    return phone.matches("(08\\d{1,4}(\\s*[\\-]\\s*)\\d{0,4}(\\s*[\\-]\\s*)\\d{3,5}|08\\d{9,11}$)|(^\\+(?:[0-9] ?){6,13}[0-9]$)|(^(?:(?:\\+|0{0,2})62) ?\\d{0,3}(\\s*[\\-]\\s*)\\d{0,4}(\\s*[\\-]\\s*)\\d{0,5})");
  }
}