/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r3musketeers.r3server.smr.delivery;

import r3musketeers.r3lib.communication.Command;
import r3musketeers.r3lib.communication.Response;

/**
 *
 * @author paola
 */
public interface CommandListener {
    
    public Response listenCommand(Command cmd);
    
}
