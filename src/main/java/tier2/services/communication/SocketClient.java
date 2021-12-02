package tier2.services.communication;

import tier2.services.utility.NetworkPackage;

public interface SocketClient
{
  void startClient();
  String communicate(NetworkPackage networkPackage);
  void disconnect();
}
