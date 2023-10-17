enum Statuss {
    ACTIVE,
    INACTIVE,
    DELETED;

    public static Statuss getStatus(String name) {
        for (Statuss status : values()) {
            if (status.name().equalsIgnoreCase(name)) {
                return status;
            }
        }
        return null;
    }

}
