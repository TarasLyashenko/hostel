package cats;

public class Weapon
{
    public String weaponType;
    public String weaponName;
    public String weaponAmount;
    public int weaponPrice;

    public Weapon(String typeWeapon, String nameWeapon, String amountWeapon, int priceWeapon)
    {
      weaponType = typeWeapon;
      weaponName = nameWeapon;
      weaponAmount = amountWeapon;
      weaponPrice = priceWeapon;
    }
}
