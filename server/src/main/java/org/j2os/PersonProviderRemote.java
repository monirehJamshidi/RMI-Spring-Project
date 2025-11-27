package org.j2os;

import java.rmi.Remote;

public interface PersonProviderRemote extends Remote {
    Person getPersonFromRemote() throws Exception;
}
