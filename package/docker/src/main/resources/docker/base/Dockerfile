FROM ubuntu:20.04

ENV DEBIAN_FRONTEND="noninteractive"

RUN add-apt-repository ppa:openjdk-r/ppa && \
    apt-get update && \
    apt install -y --no-install-recommends openjdk-11-jdk
RUN apt-get install -y gnupg2 curl && \
    curl -sS https://download.spotify.com/debian/pubkey_5E3C45D7B312C643.gpg | apt-key add - && \
    echo "deb http://repository.spotify.com stable non-free" | tee /etc/apt/sources.list.d/spotify.list && \
    apt-get update && \
    apt-get install --no-install-recommends -y x11vnc xvfb sox lame dbus ffmpeg pulseaudio dbus-x11 xinit spotify-client maven git qdbus-qt5
