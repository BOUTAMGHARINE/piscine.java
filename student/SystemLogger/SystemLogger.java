

 class SystemLog {
    public static String systemLog(String message) {
        return "System Log: "   + message;
    }
    public static void main(String[] args) {
        System.out.println(SystemLog.systemLog("message"));
    }
}
