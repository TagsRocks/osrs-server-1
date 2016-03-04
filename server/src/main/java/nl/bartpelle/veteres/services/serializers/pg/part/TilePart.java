package nl.bartpelle.veteres.services.serializers.pg.part;

import nl.bartpelle.veteres.model.Tile;
import nl.bartpelle.veteres.model.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Bart on 8/10/2015.
 */
public class TilePart implements PgJsonPart {

	@Override
	public void decode(Player player, ResultSet resultSet) throws SQLException {
		player.tile(new Tile(resultSet.getInt("x"), resultSet.getInt("z"), resultSet.getInt("level")));
	}

	@Override
	public void encode(Player player, PreparedStatement characterUpdateStatement) throws SQLException {
		characterUpdateStatement.setInt(1, player.tile().x);
		characterUpdateStatement.setInt(2, player.tile().z);
		characterUpdateStatement.setInt(3, player.tile().level);
	}

}
