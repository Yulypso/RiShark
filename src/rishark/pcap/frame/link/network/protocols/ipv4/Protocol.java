package rishark.pcap.frame.link.network.protocols.ipv4;

public enum Protocol {

    IPv6_Hop_by_Hop_Option(0),
    ICMP(1),
    IGMP_RGMP(2),
    GGP(3),
    IPv4(4),
    ST(5),
    TCP(6),
    CBT(7),
    EGP(8),
    IGRP(9),
    BBN_RCC_MON(10),
    NVP(11),
    Xerox_PUP(12),
    ARGUS(13),
    EMCON(14),
    XNET(15),
    Chaos(16),
    UDP(17),
    TMux(18),
    DCN(19),
    HMP(20),
    Packet_Radio_Measurement(21),
    XEROX_NS_IDP(22),
    Trunk_1(23),
    Trunk_2(24),
    Leaf_1(25),
    Leaf_2(26),
    RDP(27),
    IRTP(28),
    ISO_Transport_Protocol_Class_4(29),
    NETBLT(30),
    MFE_Network_Service_Protocol(31),
    MERIT_Internodal_Protocol(32),
    Sequential_Exchange_Protocol(33),
    Third_Party_Connect_Protocol(34),
    IDRP_Policy(35),
    XTP(36),
    Datagram_Delivery_Protocol(37),
    IDRP_CMTP(38),
    TP(39),
    ILTP(40),
    IPv6_Over_IPv4(41),
    SDRP(42),
    IPv6_Routing_header(43),
    IPv6_Fragment_header(44),
    IDRP(45),
    RSVP(46),
    GRE(47),
    MHRP(48),
    BNA(49),
    ESP(50),
    AH(51),
    TUBA(52),
    SWIPE(53),
    NARP(54),
    Minimal_Encapsulation_Protocol(55),
    TLSP(56),
    SKIP(57),
    ICMPv6_MLD(58),
    IPv6_No_Next_Header(59),
    Destination_Options_for_IPv6(60),
    Any_host_internal_protocol(61),
    CFTP(62),
    Any_local_network(63),
    SATNET(64),
    Kryptolan(65),
    MIT_Remote_virtual_disk_protocol(66),
    Internet_Pluribus_Packet_Core(67),
    Any_distributed_file_system(68),
    SATNET_Monitoring(69),
    VISA_Protocol(70),
    Internet_Packet_Core_Utility(71),
    Computer_Prottocol_Netwok_Executive(72),
    Computer_Prottocol_Heart_Beat(73),
    Wang_Span_Network(74),
    Packet_Video_Protocol(75),
    Backroom_SATNET_Monitoring(76),
    SUN_ND_PROTOCOL_Temporary(77),
    WIDEBAND_Monitoring(78),
    WIDEBAND_EXPAK(79),
    ISO_Internet_Protocol(80),
    VMTP(81),
    SECURE_VMTP(82),
    VINES(83),
    TTP(84),
    NSFNET_IGP(85),
    Dissimilar_Gateway_Protocol(86),
    TCF(87),
    EIGRP(88),
    OSPF_MOSPF(89),
    Sprite_RPC_Protocol(90),
    Locus_Address_Resolution_Protocol(91),
    MTP(92),
    AX25(93),
    IPIP(94),
    MICP(95),
    SCC_SP(96),
    ETHERIP(97),
    ENCAP(98),
    Any_private_encryption_scheme(99),
    GMTP(100),
    IFMP(101),
    PNNI_over_IP(102),
    PIM(103),
    ARIS(104),
    SCPS(105),
    QNX(106),
    Active_Network(107),
    IPComp(108),
    SNP(109),
    Compaq_Peer(110),
    IPX_in_IP(111),
    VRRP(112),
    PGM(113),
    any_0_hop_protocol(114),
    L2TP(115),
    DDX(116),
    IATP(117),
    STP(118),
    SRP(119),
    UTI(120),
    SMP(121),
    SM(122),
    PTP(123),
    ISI_over_IPv4(124),
    FIRE(125),
    CRTP(126),
    CRUDP(127),
    SSCOPMCE(128),
    IPLT(129),
    SPS(130),
    PIPE(131),
    SCTP(132),
    Fibre_Channel(133),
    RSVP_E2E_IGNORE(134),
    Mobility_Header1(135),
    Mobility_Header2(136),
    MPLS_in_IP(137),
    Testing1(253),
    Testing2(254),
    Reserved(255);

    private final int protocol;

    Protocol(int protocol) {
        this.protocol = protocol;
    }

    public static Protocol findProtocol(int i){
        for(Protocol p : Protocol.values()) {
            if(p.getProtocol() == i) {
                return p;
            }
        }
        return null;
    }

    public int getProtocol() {
        return protocol;
    }
}
