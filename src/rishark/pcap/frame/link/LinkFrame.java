package rishark.pcap.frame.link;

import rishark.pcap.frame.link.network.NetworkPacket;
import rishark.pcap.frame.link.protocols.arp.Arp;
import rishark.pcap.frame.link.protocols.LinkProtocol;
import utils.Utils;

public class LinkFrame {

    private NetworkPacket networkPacket;
    private LinkProtocol linkProtocol;
                                        // 14 bytes
    private final String srcAdress;     // 6 bytes
    private final String destAdress;    // 6 bytes
    private final String etherType;     // 2 bytes

    private final String raw;

    public LinkFrame(String raw) {
        this.destAdress = Utils.readBytesFromIndex(raw, 0, 6);
        this.srcAdress = Utils.readBytesFromIndex(raw, 6, 6);
        this.etherType = Utils.readBytesFromIndex(raw, 12, 2);

        this.raw = Utils.readBytesFromIndex(raw, 14, (raw.length()/2) - 14);

        Protocol e;
        if ((e = Protocol.findEtherType(this.etherType)) == null) {
            /* Only IPv4, IPv6 and ARP are treated */
            System.out.println("EtherType is Untreated.");
        } else {
            /* Continue decapsulation */
            switch (e) {
                case ARP -> this.linkProtocol = new Arp(this.raw);
                default -> this.networkPacket = new NetworkPacket(this.raw, e);
            }
        }
    }

    public String getSrcAdress() {
        return srcAdress;
    }

    public String getDestAdress() {
        return destAdress;
    }

    public String getEtherType() {
        return etherType;
    }

    public String getRaw() {
        return raw;
    }

    public NetworkPacket getNetworkPacket() {
        return networkPacket;
    }

    public LinkProtocol getLinkProtocol() {
        return linkProtocol;
    }

    public long getLinkFrameSize() {
        return 14 + this.linkProtocol.getSize();
    }
}