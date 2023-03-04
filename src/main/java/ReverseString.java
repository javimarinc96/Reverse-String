class ReverseString {

    String reverse(String inputString) {
        StringBuilder build = new StringBuilder(inputString);
        build.reverse();
        return build.toString();
    }
  
}
