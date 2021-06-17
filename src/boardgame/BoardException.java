package boardgame;

public class BoardException extends RunTimeException {

	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {
		super(msg);
	}

	public boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		return piece(position) != null;
	}
}
