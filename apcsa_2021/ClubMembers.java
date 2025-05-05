package apcsa_2021;

import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        this.memberList = new ArrayList<>();
        this.memberList.add(new MemberInfo("SMITH, JANE", 2019, false));
        this.memberList.add(new MemberInfo("FOX, STEVE", 2018, true));
        this.memberList.add(new MemberInfo("XIN, MICHAEL", 2017, false));
        this.memberList.add(new MemberInfo("GARCIA, MARIA", 2020, true));
    }

    /**
     * Adds new club members to memberList, as described in part (a).
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear) {
        /* to be implemented in part (a) */
        for (String name : names)
            memberList.add(new MemberInfo(name, gradYear, true));
    }

    /**
     * Removes members who have graduated and returns a list of members who have
     * graduated
     * and are in good standing, as described in part (b).
     */
    public ArrayList<MemberInfo> removeMembers(int year) {
        /* to be implemented in part (b) */
        ArrayList<MemberInfo> res = new ArrayList<>();
        // for (MemberInfo m : memberList) {
        for (int i = memberList.size() - 1; i >= 0; i--) {
            MemberInfo m = memberList.get(i);
            if (m.getGradYear() <= year) {
                if (m.inGoodStanding())
                    res.add(m);
                memberList.remove(i);
            }
        }

        return res;
    }

    public void printMemberList() {
        for (MemberInfo m : this.memberList)
            System.out.println(m.getName() + "-" + m.getGradYear() + "-" + m.inGoodStanding());
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

    public static void main(String[] args) {
        ClubMembers cm = new ClubMembers();
        ArrayList<MemberInfo> res = cm.removeMembers(2018);
        System.out.println(res.size());
        cm.printMemberList();
        MemberInfo m = res.get(0);
        System.out.println(m.getName() + "-" + m.getGradYear() + "-" + m.inGoodStanding());
    }
}
