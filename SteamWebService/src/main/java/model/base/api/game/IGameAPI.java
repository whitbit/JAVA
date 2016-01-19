package model.base.api.game;

public interface IGameAPI {
	public int getAppID();
	public void buildGame();
	public IGameAPI createGame();
	public IGameAPI getNewObject();
}