package cakechallenge;

public class WeddingCake extends Cake {

  private int tiers;

  public WeddingCake() {
    super(flavor: "Almond");
  }

  public int getTiers() {
    return this.tiers;
  }

  public void setTiers(int tiers) {
    this.tiers = tiers;
  }

  
}
