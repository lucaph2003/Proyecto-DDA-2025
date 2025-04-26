package proyecto.pkgfinal.dominio.model.exceptions;

import proyecto.pkgfinal.dominio.model.utils.enums.SessionTypesErrors;

public class SessionException extends Exception{
    private SessionTypesErrors type;

    public SessionException(String message, SessionTypesErrors type) {
        super(message);
        this.type = type;
    }

    public SessionTypesErrors getType(){
      return this.type;
    }
}
