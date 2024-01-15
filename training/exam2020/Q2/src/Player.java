
import java.util.ArrayList;
import java.util.List;

public class Player {
    public enum State{
      LockState{
        @Override
        public String onPlay(Player player){
          player.setMode(State.ReadyState);
          return Player.EtatEnum.READY.name();
        }
        @Override
        public String onLock(Player player) {
          return Player.EtatEnum.LOCKED.name();
        }
      },
      ReadyState{
        @Override
        public String onPlay(Player player) {
          String action = player.startPlayback();
          player.setMode(State.PlayState);
          return action;
        }
        @Override
        public String onLock(Player player) {
          player.setMode(State.LockState);
          return Player.EtatEnum.LOCKED.name();
        }
      }, PlayState{
        @Override
        public String onPlay(Player player){
          player.setMode(State.ReadyState);
          return Player.EtatEnum.PAUSED.name();
        }
        @Override
        public String onLock(Player player){
          player.setMode(State.LockState);
          player.setCurrentTrackAfterStop();
          return Player.EtatEnum.STOP.name();
        }
        public String onNext(Player player) {
          return player.nextTrack();
        }
        public String onPrevious(Player player) {
          return player.previousTrack();
        }
      };
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
    private State mode;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;

    public Player() {
        this.mode = State.ReadyState;
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
    }

    public void changeMode(State mode) {
        this.mode = mode;
    }

    public State getMode() {
        return mode;
    }

	public void setMode(State mode) {
		this.mode = mode;
	}

	public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }

	public String onPlay() {
		return mode.onPlay(this);
	}

	public String onLock() {
		return mode.onLock(this);
	}

	public String onNext() {
		return mode.onNext(this);
	}

	public String onPrevious() {
		return mode.onPrevious(this);
	}
	public enum EtatEnum {
		LOCKED("Locked..."), STOP("Stop playing"), READY("Ready"), PAUSED("Paused...");
		private String etat;
		EtatEnum(String etat){
			this.etat = etat;
		}
	}

}
