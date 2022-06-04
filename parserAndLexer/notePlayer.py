import librosa
import encode
import pygame
import numpy as np
import time

class NotePlayer:
    def __init__(self) -> None:
        pygame.mixer.init()
        self.queue = []

        
    def playNote(self, note):
        tone = self.generateNote(note)
        soundObj = pygame.sndarray.make_sound(encode.as_int16(tone))
        length = soundObj.get_length()
        soundObj.play()
        time.sleep(length)
        
 
    def generateNote(self, note):
        # frequency = 440*2**((note-69)/12)
        frequency = librosa.midi_to_hz(note)
        tone = librosa.tone(frequency, duration=1)
        tone = librosa.effects.preemphasis(tone)
        tone = np.repeat(tone.reshape(len(tone), 1), 2, axis = 1)
        return tone
    

    def exit(self):
        pygame.mixer.quit()

if  __name__ == '__main__':
    player = NotePlayer()
    player.playNote(50)
               
