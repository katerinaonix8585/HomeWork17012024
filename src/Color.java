public enum Color {

    RED,
    GREEN,
    BLUE;

    public String getRGB(Color color) {
        switch (color) {
            case RED:
                return "225, 0, 0";
            case BLUE:
                return "0, 0, 225";
            case GREEN:
                return "0, 255, 0";
            default:
                return "error";
        }

    }

}
