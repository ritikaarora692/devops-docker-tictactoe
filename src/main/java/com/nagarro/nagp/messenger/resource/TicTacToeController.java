package com.nagarro.nagp.messenger.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import tictactoe.model.Game;

@Path("/tictactoe")
public class TicTacToeController {

	private Game game = new Game();
	
	@GET
	public String index(  ) {
		return "index";
	}

	@POST
	public String markTile( 
			@PathParam("tile_id") String tileId,
			@PathParam(value = "new_game") boolean newGame,
			@PathParam(value = "player_go_first") boolean playerGoFirst 
			) {
		
		if ( newGame ) {
			game.reset();
			game.setPlayerGoFirst( playerGoFirst );
			if ( !playerGoFirst ) {
				// give computer a small advantage by always placing X in the center as its first move
				game.markTile( "1-1" );
			}
		} else {
			game.markTile( tileId ); // Player Turn
			
			game.markTileRandom(); // Computer Turn
		}
		
		return "index";
	}
	

}