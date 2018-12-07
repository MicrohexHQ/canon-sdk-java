package org.blackdread.cameraframework.api.helper.logic;

import org.blackdread.camerabinding.jna.EdsdkLibrary.EdsCameraRef;
import org.blackdread.cameraframework.api.command.CanonCommand;

/**
 * Dispatcher of commands of the framework.
 * <p>Created on 2018/11/03</p>
 *
 * @author Yoann CAPLAIN
 */
public interface CommandDispatcher {

    /**
     * Schedule a command to be executed by dispatcher
     *
     * @param command command to execute asynchronously
     */
    void scheduleCommand(final CanonCommand<?> command);

    /**
     * Schedule a command to be executed by dispatcher
     *
     * @param owner   camera owner of this command
     * @param command command to execute asynchronously
     */
    void scheduleCommand(final EdsCameraRef owner, final CanonCommand<?> command);

}
