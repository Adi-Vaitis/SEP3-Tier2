package tier2.network.communication;

import tier2.services.utility.NetworkPackage;

public interface SocketClient
{
  void startClient();
  String communicate(NetworkPackage networkPackage);
  void disconnect();
}
