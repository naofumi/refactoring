package com.example.p287_replace_inheritance_with_delegation;

public class FamilyMember extends Person {
    private String familyRole;

    public String getFamilyRole() {
        return familyRole;
    }

    public void setFamilyRole(String familyRole) {
        this.familyRole = familyRole;
    }
}
