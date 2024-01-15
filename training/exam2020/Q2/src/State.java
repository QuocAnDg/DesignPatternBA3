public abstract class State {
  public String onPlay(Player player){
    throw new RuntimeException();
  }
  public String onLock(Player player) {
    throw new RuntimeException();
  }
  public String onNext(Player player) {
    return Player.EtatEnum.LOCKED.name();
  }
  public String onPrevious(Player player) {
    return Player.EtatEnum.LOCKED.name();
  }
}
