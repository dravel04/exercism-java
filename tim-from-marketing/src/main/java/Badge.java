class Badge {
    public String print(Integer id, String name, String department) {
        String badge = null;
        
        badge = ((id == null) ? "" : '[' + id.toString() + "] - ") +
            name + " - " + 
            ((department == null) ? "OWNER" : department.toUpperCase())
        ;

        return badge;
    }

    // public static void main(String[] args) {
    //     Badge badge = new Badge();
    //     System.out.println(badge.print(734, "Ernest Johnny Payne", "Strategic Communication"));
    // }
}
