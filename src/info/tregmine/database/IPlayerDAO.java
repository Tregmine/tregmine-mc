package info.tregmine.database;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.entity.Player;

import info.tregmine.api.Badge;
import info.tregmine.api.TregminePlayer;

public interface IPlayerDAO {
	public TregminePlayer createPlayer(Player wrap) throws DAOException;

	public boolean doesIgnore(TregminePlayer player, TregminePlayer victim) throws DAOException;

	public Map<Badge, Integer> getBadges(TregminePlayer player) throws DAOException;

	public List<String> getIgnored(TregminePlayer to) throws DAOException;

	public List<String> getKeywords(TregminePlayer to) throws DAOException;

	public TregminePlayer getPlayer(int id) throws DAOException;

	public TregminePlayer getPlayer(Player player) throws DAOException;

	public void updateBadges(TregminePlayer player) throws DAOException;

	public void updateIgnore(TregminePlayer player, List<String> update) throws DAOException;

	public void updateKeywords(TregminePlayer player, List<String> update) throws DAOException;

	public void updatePlayer(TregminePlayer player) throws DAOException;

	public void updatePlayerInfo(TregminePlayer player) throws DAOException;

	public void updatePlayerKeyword(TregminePlayer player) throws DAOException;

	public void updatePlayTime(TregminePlayer player) throws DAOException;

	public void updateProperty(TregminePlayer player, String key, String value) throws DAOException;

	public TregminePlayer getPlayer(UUID id) throws DAOException;
}
